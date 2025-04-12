# 💬 Simple Java Chat Application

A basic client-server chat application built using **Java** and **TCP/IP socket programming**. This project demonstrates real-time communication between a client and a server over a local network using Java sockets.

## 🚀 Features
- Real-time message exchange between client and server
- Uses Java `Socket` and `ServerSocket` classes (TCP protocol)
- Simple terminal-based interface
- Supports continuous two-way communication until either side types `exit`
- Demonstrates the core concepts of multistream input/output using `DataInputStream`, `DataOutputStream`, and `BufferedReader`

## 🛠 Technologies Used
- Java
- TCP/IP Socket Programming
- IntelliJ IDEA
- Git & GitHub

## 📁 Project Structure

```
SimpleChatApplication/
├── src/
│   ├── client/
│   │   └── ClientProg.java
│   └── server/
│       └── ServerProg.java
├── .gitignore
└── README.md
```

## ⚙️ How to Run

### 🔹 Server
1. Open a terminal.
2. Navigate to the `src/server` directory.
3. Compile and run:
   ```bash
   javac ServerProg.java
   java server.ServerProg
   ```

### 🔹 Client
1. Open another terminal.
2. Navigate to the `src/client` directory.
3. Compile and run:
   ```bash
   javac ClientProg.java
   java client.ClientProg
   ```

Now you can chat between client and server in real-time!

## 🧾 Output

Here’s an example of how the conversation looks:

![Picture1](https://github.com/user-attachments/assets/08f6b2b7-b535-4abf-b427-0c05e535ef19)

![Picture2](https://github.com/user-attachments/assets/5822450d-4319-4f01-a0f6-3f0431f828ec)

## 📌 Note
- The communication is **one-to-one** and occurs **locally (localhost)**.
- For multi-client support or GUI-based interaction, enhancements can be made in future versions.

## 👩‍💻 Author
**Arshiya Shaikh**  
📬 [GitHub](https://github.com/arshiyaa7)

