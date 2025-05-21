<template>
  <div class="profile-settings">
    <h1>Profile Settings</h1>
    <form>
      <input type="text" placeholder="Full Name" />
      <input type="email" placeholder="Email" />
      <input type="password" placeholder="New Password" />
      <button type="submit">Update</button>
    </form>
  </div>
</template>

<script setup>
</script>

<style scoped>
.profile-settings {
  color: white;
  padding: 20px;
  max-width: 500px;
  margin: auto;
}
input, button {
  display: block;
  margin: 10px 0;
  padding: 10px;
  width: 100%;
  background: #2a2a2a;
  color: white;
  border: none;
  border-radius: 4px;
}
button {
  background-color: #00ff88;
  color: #121212;
  cursor: pointer;
}
</style>