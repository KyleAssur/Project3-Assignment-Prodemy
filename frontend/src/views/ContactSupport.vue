<template>
  <div class="contact-support">
    <h1>Contact Support</h1>
    <form>
      <input type="text" placeholder="Your Name" />
      <input type="email" placeholder="Your Email" />
      <textarea placeholder="How can we help?" rows="5"></textarea>
      <button type="submit">Send</button>
    </form>
  </div>
</template>

<script setup>
</script>

<style scoped>
.contact-support {
  color: white;
  padding: 20px;
  max-width: 600px;
  margin: auto;
}
input, textarea, button {
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
