# BloodConnect OCL Constraints

## 1. Valid User Age
**Context:** User  
**Rule:** The age of the user must be 18 or older to register  
**OCL Expression:**
```
context Donor
    inv: self.age >= 18 and self.age <= 65
```

## 2. Unique Email for Each User
**Context:** User  
**Rule:** No two users can have the same email address  
**OCL Expression:**
```
context Donor
    inv: User.allInstances()->forAll(u1, u2 | 
        u1 <> u2 implies u1.email <> u2.email)
```

## 3. Valid Blood Request
**Context:** BloodRequest  
**Rule:** The blood request must specify a valid blood type (A+, O-, etc) and urgency level  
**OCL Expression:**
```
context BloodRequest
    inv: self.bloodType.matches('^(A|B|AB|O)[+-]$') 
        and self.urgencyLevel > 0
```

## 4. Donor Eligibility
**Context:** Donor  
**Rule:** A donor must not have donated blood in the last 56 days to be eligible to donate  
**OCL Expression:**
```
context Donor
    inv: self.lastDonationDate.isBefore(today().subtractDays(56))
```

## 5. Matching Blood Types for Donations
**Context:** BloodRequest  
**Rule:** The blood type of the donor must match the recipient's request  
**OCL Expression:**
```
context BloodRequest
    inv: self.matchingDonors->forAll(d | d.bloodType = self.bloodType)
```

## 6. Positive Donation Amount
**Context:** Donation  
**Rule:** The amount of blood donated must be greater than zero  
**OCL Expression:**
```
context Donation
    inv: self.amount > 0
```

## 7. Request Status Update
**Context:** BloodRequest  
**Rule:** A request's status can only change to "Fulfilled" if a valid donation is logged  
**OCL Expression:**
```
context BloodRequest
    inv: self.status = 'Fulfilled' implies 
        self.donations->exists(d | d.isValid = true)
```

## 8. Unique Blood Donation History Entries
**Context:** Donation  
**Rule:** Each donation entry must be unique based on donor, recipient, and donation date  
**OCL Expression:**
```
context Donation
    inv: Donation.allInstances()->isUnique(d | 
        d.donor.id, d.recipient.id, d.date)
```

## 9. Emergency Support Access
**Context:** User  
**Rule:** All users must have access to emergency contact details at any time, regardless of login status  
**OCL Expression:**
```
context User
    inv: self.emergencyContacts->notEmpty()
```

## 10. Valid Map Integration
**Context:** MapIntegration  
**Rule:** The map must only display active blood requests and verified blood banks  
**OCL Expression:**
```
context MapIntegration
    inv: self.displayedRequests->forAll(r | r.status = 'active') 
        and self.displayedLocations->forAll(l | l.isVerified = true)
```
