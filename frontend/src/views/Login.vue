<template>
  <div :class="['auth-container', theme]">
    <div class="graphic-section">
      <img src="@/assets/logo.png" alt="Graphic" />
    </div>
    <div class="form-section">
      <h2 class="title">Welcome back!</h2>
      <p class="subtitle">Manage your tasks. Master your learning.<br />Archive more with Prodemy!</p>

      <form @submit.prevent="handleLogin">
        <label for="email">Username/Email</label>
        <input type="email" id="email" v-model="email" placeholder="Enter your email" required />

        <div class="password-row">
          <label for="password">Password</label>
          <a href="#" class="forgot">Forgot password?</a>
        </div>
        <input type="password" id="password" v-model="password" placeholder="Enter your password" required />

        <div class="checkbox-row">
          <input type="checkbox" id="remember" />
          <label for="remember">Remember Me</label>
        </div>

        <button type="submit">Login</button>
      </form>

      <div class="divider"><span>or</span></div>

      <div class="social-login">
        <button class="google">Sign in with Google</button>
        <button class="apple">Sign in with Apple</button>
      </div>

      <p class="footer">Don't have an account? <a href="/signup">Sign Up</a></p>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

// Track email, password, and current theme
const email = ref('');
const password = ref('');
const theme = ref(localStorage.getItem('theme') || 'light');

// Handle login
function handleLogin() {
  console.log('Logging in with', email.value, password.value);
}

// Toggle dark mode
function toggleDarkMode() {
  theme.value = theme.value === 'dark' ? 'light' : 'dark';
  localStorage.setItem('theme', theme.value);
}
</script>

<style scoped>
.auth-container {
  display: flex;
  height: 100vh;
  overflow: hidden;
  transition: background-color 0.3s ease;
}

.auth-container.light {
  background-color: #f4f4f4;
}

.auth-container.dark {
  background-color: #121212;
}

.graphic-section {
  flex: 1;
  background-color: #0d0d0d;
  display: flex;
  justify-content: center;
  align-items: center;
}

.graphic-section img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: center;
}

.form-section {
  flex: 1;
  background-color: #7eff7e;
  padding: 40px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  font-family: Arial, sans-serif;
  transition: background-color 0.3s ease;
}

.form-section.light {
  background-color: #eaf0e3;
}

.form-section.dark {
  background-color: #333;
}

.title {
  font-size: 24px;
  font-weight: 700;
  margin-bottom: 10px;
}

.subtitle {
  font-size: 14px;
  margin-bottom: 20px;
}

form label {
  font-size: 14px;
  margin-bottom: 4px;
  display: block;
  color: #121212;
}

input[type="email"],
input[type="password"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 15px;
  border: 1px solid #000;
  border-radius: 6px;
}

.password-row {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.forgot {
  font-size: 12px;
  color: #000;
  text-decoration: none;
}

.checkbox-row {
  display: flex;
  align-items: center;
  gap: 8px;
  margin-bottom: 20px;
}

button[type="submit"] {
  background-color: #86b817;
  color: white;
  padding: 10px;
  border: none;
  width: 100%;
  border-radius: 6px;
  cursor: pointer;
  font-weight: bold;
}

button[type="submit"]:hover {
  background-color: #76a115;
}

.divider {
  text-align: center;
  margin: 20px 0;
  position: relative;
}

.divider span {
  background: #7eff7e;
  padding: 0 10px;
  position: relative;
  z-index: 1;
}

.divider::before {
  content: "";
  position: absolute;
  top: 50%;
  left: 0;
  width: 100%;
  height: 1px;
  background: #ccc;
  z-index: 0;
}

.social-login {
  display: flex;
  justify-content: space-between;
  gap: 10px;
  margin-bottom: 20px;
}

.google, .apple {
  flex: 1;
  padding: 10px;
  border: 1px solid #000;
  border-radius: 6px;
  background: white;
  cursor: pointer;
}

.google:hover,
.apple:hover {
  background-color: #f0f0f0;
}

.footer {
  font-size: 14px;
  text-align: center;
  color: #121212;
}

.footer a {
  text-decoration: none;
  font-weight: bold;
}

.footer a:hover {
  color: #007bff;
}

</style>
