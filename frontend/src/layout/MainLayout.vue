<template>
  <div class="layout">
    <Header />

    <main>
      <router-view />
    </main>

    <Footer />
  </div>
</template>

<script setup>
import Header from './Header.vue'
import Footer from './Footer.vue'
</script>

<style scoped>
.layout {
  background-color: #121212;
  color: white;
  min-height: 100vh;
}
main {
  padding: 20px;
}
</style>
