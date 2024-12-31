# Business/Domain Rules: Blood Donation Platform

## 1. Purpose
This section outlines the rules and policies governing the system's behavior, ensuring that the platform operates within defined parameters. It includes constraints on donor eligibility, request management with references to specific system entities or use cases.

## 2. Business Rules

### Donor Eligibility
**Context:** Donor  
**Rule:** A user must be at least 18 years old and no older than 65 years old to donate blood.

**OCL:**
```
context Donor
    inv: self.age >= 18 and self.age <= 65
```

**Description:** This rule ensures that only individuals within the medically approved age range can be eligible for donation. If a donor does not meet the age requirement, they will not be able to proceed with the donation process.

### Blood Type Compatibility
**Context:** Blood request  
**Rule:** A donor can only donate blood of the type they possess, and a recipient can only receive the blood type that matches their own or compatible types.

**OCL:**
```
context BloodDonation
    inv: self.donor.bloodType = self.recipient.bloodType or
         (self.donor.bloodType = 'O' and self.recipient.bloodType in ['A', 'B', 'AB']) or
         (self.donor.bloodType = 'A' and self.recipient.bloodType in ['A', 'AB']) or
         (self.donor.bloodType = 'B' and self.recipient.bloodType in ['B', 'AB']) or
         (self.donor.bloodType = 'AB' and self.recipient.bloodType = 'AB')
```

**Description:** This rule ensures that blood type compatibility is respected when a donation is made. The matching logic follows standard blood compatibility guidelines.

### Donor Frequency
**Context:** Donor  
**Rule:** A donor may only donate blood once every 3 months to ensure their health is not compromised.

**OCL:**
```
context Donor
    inv: self.donations->last().date.addMonths(3) <= currentDate
```

**Description:** This rule ensures that donors adhere to the health guidelines regarding donation frequency, preventing them from donating too frequently and ensuring safe blood donations.

## 3. Tied Rules to System Entities

### Donor Eligibility
- **Tied to:** Donor Entity
- **Implementation:** This rule is applied when a user attempts to register as a donor. It ensures only eligible donors can proceed with the donation process.

### Blood Type Compatibility
- **Tied to:** Blood Donation/request use cases
- **Implementation:** The system verifies that the blood type of both the donor and recipient are compatible before confirming a match.

### Donor Frequency
- **Tied to:** Donor Entity
- **Implementation:** The system tracks donation frequency and ensures donors cannot donate too frequently.
