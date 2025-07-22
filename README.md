# 💳 TorBank – Simple Banking System

## 📌 Overview

**TorBank** is a lightweight console-based banking system built using **C/C++**, designed for educational purposes. It demonstrates core functionalities of a bank such as:

- Creating new accounts  
- Logging in existing users  
- Performing withdrawals, deposits, and transfers  
- Viewing account balance  
- Viewing transaction history

The system uses basic file handling to store account data and transaction logs persistently.

---

## 🚀 Features

- **Account Management**
  - Create new accounts with username, password, and initial balance
  - Store and retrieve account data from text files

- **Authentication**
  - Secure login system using username and password

- **Banking Operations**
  - **Withdraw**: Ensure sufficient balance before deduction
  - **Deposit**: Add funds to your account
  - **Transfer**: Send money to another user within the system
  - **Check Balance**: View current account balance
  - **Transaction Log**: View history of operations with details (type, amount, recipient, date, etc.)

---

## 📂 Project Structure

```
TorBank/
├── main.c / main.cpp         # Entry point – main menu and user interface
├── account.c / account.cpp   # Account creation, login, validation
├── transaction.c / .cpp      # Banking operations and transaction logging
├── accounts.txt              # Stores account data
├── transactions.txt          # Stores transaction history
└── README.md                 # This documentation file
```

---

## 👤 Example Usage

1. **Register New Account**

   * Username: `ahmed`
   * Password: `1234`
   * Initial Balance: `1000`

2. **Login**

   * Enter username and password

3. **Operations Available**

   * Withdraw, Deposit, Transfer, View Balance, View History
---

## Author

* **Name**: Ahmed Maher
* **GitHub**: [AhmedMaherAbdRabbo](https://github.com/AhmedMaherAbdRabbo)

---

