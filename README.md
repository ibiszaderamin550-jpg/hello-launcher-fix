🧠 Note

Void Craft Launcher is actively optimized and maintained by Hyper Company. If you want to run Minecraft: Java Edition on Android devices and get a better and fixed experience, please use this Hello Launcher Fix version. Note: If you have any problems or suggestions, Ramin Ibiszade and the Hyper Company team are here to help.

---

<h1 align="center">Void Craft Launcher</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android">
  <img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white" alt="Discord">
  <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
</p>

---

* **Hello Launcher Fix (Void Craft):** The software attempts to restore, fix, and optimize HMCL on Android devices, allowing players to seamlessly manage Games, Mods, Controls, and More.
* **Run Minecraft Java Edition** directly on your Android device, with enhanced mod support, custom optimization, and all versions of the Game.

### ✨ Features
* 🌌 **Customizable Launcher Themes:** Fully optimized for Void/Dark minimalist aesthetic.
* 🛠️ **Create Custom Controllers:** Easily map your buttons for mobile touch gameplay.
* 🔮 **Using Shaders:** Full support for high-performance Shaders (with VirGL).
* ⚡ **Performance Boost:** Fixed crashes and reduced RAM lag for a smoother experience.
* 🚀 And much more!

---

## 🛠️ Compilation

You can compile the software using **Android Studio** with the Android SDK & NDK packages, or directly on your mobile device using **Termux**.

### Compiling via Termux:
```bash
pkg update && pkg upgrade -y
pkg install git openjdk-17 nodejs -y
git clone [https://github.com/ibiszaderamin550-jpg/hello-launcher-fix.git](https://github.com/ibiszaderamin550-jpg/hello-launcher-fix.git)
cd hello-launcher-fix
chmod +x gradlew
./gradlew assembleDebug
