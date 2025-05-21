<template>
  <div class="signup-container">
    <div class="form-section">
      <h2>Get Started Now</h2>
      <p>Manage your tasks. Master your learning. Achieve more with Prodemy!</p>
      <form @submit.prevent="handleSignup">
        <input v-model="name" type="text" placeholder="Name" required />
        <input v-model="email" type="email" placeholder="Email address" required />
        <input v-model="password" type="password" placeholder="Password" required />
        <div class="checkbox">
          <input v-model="agreed" type="checkbox" id="terms" />
          <label for="terms">I agree to the terms & policy</label>
        </div>
        <button type="submit">Signup</button>
      </form>
      <div class="divider"><span>OR</span></div>
      <div class="social-login">
        <button class="google">Sign in with Google</button>
        <button class="apple">Sign in with Apple</button>
      </div>
      <p class="signin-link">Have an account? <router-link to="/login">Sign in</router-link></p>
    </div>
    <div class="graphic-section">
      <img :src="logo" alt="Logo Graphic" />
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import logo from '@/assets/logo.png'

const name = ref('')
const email = ref('')
const password = ref('')
const agreed = ref(false)

const handleSignup = () => {
  if (!agreed.value) {
    alert('You must agree to the terms.')
    return
  }
  alert(`Signup successful!\nName: ${name.value}\nEmail: ${email.value}`)
}
</script>

<style scoped>
.signup-container {
  display: flex;
  flex-direction: row;
  min-height: 100vh;
  background: #0d0d0d;
  color: #fff;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

.form-section {
  flex: 1;
  padding: 60px;
  background-color: #9EFF80;
  color: #121212;
  display: flex;
  flex-direction: column;
  justify-content: center;
  max-width: 600px;
}

.form-section h2 {
  font-size: 2.5rem;
  margin-bottom: 10px;
  color: #1e1e1e;
}

.form-section p {
  margin-bottom: 30px;
  font-weight: 500;
  color: #2b2b2b;
}

form input {
  width: 100%;
  padding: 14px 16px;
  margin-bottom: 15px;
  border: none;
  border-radius: 8px;
  font-size: 1rem;
  background-color: #f2f2f2;
  color: #121212;
}

form input::placeholder {
  color: #777;
}

.checkbox {
  display: flex;
  align-items: center;
  margin-bottom: 20px;
  font-size: 0.95rem;
}

.checkbox input {
  margin-right: 10px;
  accent-color: #5cae29;
}

button {
  background-color: #5cae29;
  color: white;
  border: none;
  padding: 14px;
  width: 100%;
  border-radius: 8px;
  cursor: pointer;
  font-weight: bold;
  font-size: 1rem;
  transition: background 0.3s ease;
}

button:hover {
  background-color: #489c1f;
}

.divider {
  text-align: center;
  margin: 20px 0;
  position: relative;
  font-weight: 600;
  color: #444;
}

.divider::before,
.divider::after {
  content: '';
  position: absolute;
  height: 1px;
  background-color: #bbb;
  top: 50%;
  width: 40%;
}

.divider::before {
  left: 0;
}

.divider::after {
  right: 0;
}

.divider span {
  padding: 0 10px;
  background: #9EFF80;
  z-index: 1;
  position: relative;
}

.social-login button {
  width: 100%;
  margin-bottom: 10px;
  padding: 12px;
  font-weight: bold;
  font-size: 0.95rem;
  border: none;
  border-radius: 8px;
  cursor: pointer;
  transition: all 0.3s ease;
}

.google {
  background-color: white;
  color: #333;
}

.google:hover {
  background-color: #e5e5e5;
}

.apple {
  background-color: #000;
  color: white;
}

.apple:hover {
  background-color: #333;
}

.signin-link {
  text-align: center;
  margin-top: 25px;
  font-size: 0.95rem;
}

.signin-link a {
  color: #007bff;
  text-decoration: none;
  font-weight: bold;
}

.signin-link a:hover {
  text-decoration: underline;
}
.graphic-section {
  flex: 1;
  background-color: #0d0d0d;
  display: flex;
  justify-content: center;
  align-items: center;
  overflow: hidden;
  position: relative;
}

.graphic-section img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: center;
}
</style>

