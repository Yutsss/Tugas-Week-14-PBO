# **Tugas Week 14 PBO**

**Nama** : Adyuta Prajahita Murdianto

**NRP** : 5025221186

**Kelas** : PBO A

# **LoginFrame**

## **Class LoginFrame**

### **1. Atribut**

- **userLabel**

  `JLabel` yang menampilkan teks "Username:".
  
- **passwordLabel**

  `JLabel` yang menampilkan teks "Password:".
  
- **userTextField**

  `JTextField` yang digunakan untuk memasukkan nama pengguna (username).
  
- **passwordField**

  `JPasswordField` yang digunakan untuk memasukkan kata sandi (password).
  
- **loginButton**

  `JButton` yang ketika diklik akan memeriksa kredensial login.

### **2. Konstruktor `LoginFrame()`**

- `setTitle("User Login")`: Memberikan judul pada jendela aplikasi (frame).

- `setLayout(new FlowLayout())`: Mengatur layout manager untuk frame menggunakan FlowLayout, yang secara otomatis mengatur posisi komponen secara berurutan (flow).
  
- `setSize(300, 200)`: Mengatur ukuran window (frame) menjadi 300 piksel lebar dan 200 piksel tinggi.
  
- `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`: Mengatur perilaku jendela ketika ditutup, dalam hal ini aplikasi akan keluar saat jendela ditutup.
  
- `userLabel = new JLabel("Username:") dan passwordLabel = new JLabel("Password:")`: Membuat label teks untuk username dan password.
  
- `userTextField = new JTextField(20)`: Membuat JTextField untuk input username, dengan lebar 20 kolom.

- `passwordField = new JPasswordField(20)`: Membuat JPasswordField untuk input password, juga dengan lebar 20 kolom.
  
- `loginButton = new JButton("Login")`: Membuat tombol login dengan teks "Login".

### **3. Event Listener**

- `loginButton.addActionListener(new ActionListener() { ... })`: Menambahkan aksi yang akan dilakukan saat tombol login diklik. Dalam hal ini:

  - `String username = userTextField.getText();`: Mengambil teks dari field username.
  
  - `String password = new String(passwordField.getPassword());`: Mengambil password sebagai string dari JPasswordField (karena password disimpan sebagai array char, kita mengkonversinya ke string).

  - `if (username.equals("admin") && password.equals("password"))`: Mengecek apakah username dan password sesuai dengan nilai yang telah ditentukan ("admin" dan "password").

    - Jika benar, menampilkan pesan `Login Successful` menggunakan `JOptionPane.showMessageDialog()`.
  
    - Jika salah, menampilkan pesan `Invalid Username or Password`.

### **4. Menambahkan Komponen ke Frame**

- `add(userLabel)`: Menambahkan label username ke frame.

- `add(userTextField)`: Menambahkan text field untuk username ke frame.

- `add(passwordLabel)`: Menambahkan label password ke frame.

- `add(passwordField)`: Menambahkan text field untuk password ke frame.

- `add(loginButton)`: Menambahkan tombol login ke frame.

### **5. Hasil**

![alt text](Resource/LoginFrame/image.png)

# **ImageViewer**