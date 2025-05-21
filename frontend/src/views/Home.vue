<template>
  <div class="home">
    <section class="hero">
      <h1>Welcome to <span class="brand">Prodemy</span></h1>
      <p>Your platform to learn, grow, and master productivity skills.</p>
      <router-link to="/signup" class="cta">Get Started</router-link>
    </section>

    <section class="features">
      <div class="feature-card">
        <h2>📚 Courses</h2>
        <p>Access curated learning paths designed to boost your productivity and tech skills.</p>
      </div>
      <div class="feature-card">
        <h2>👥 Community</h2>
        <p>Join like-minded learners and grow together in our interactive community space.</p>
      </div>
      <div class="feature-card">
        <h2>🚀 Projects</h2>
        <p>Work on real-world tasks that enhance your resume and build your confidence.</p>
      </div>
    </section>
  </div>
</template>

<script setup>
// No JS needed yet
</script>

<style scoped>
.home {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 40px 20px;
  color: white;
}

.hero {
  text-align: center;
  max-width: 800px;
  margin-bottom: 50px;
}

.hero h1 {
  font-size: 2.5rem;
  margin-bottom: 10px;
}

.hero .brand {
  color: #00ff88;
}

.hero p {
  font-size: 1.2rem;
  color: #ccc;
  margin-bottom: 20px;
}

.cta {
  padding: 10px 20px;
  background-color: #00ff88;
  color: #121212;
  border-radius: 5px;
  text-decoration: none;
  font-weight: bold;
  transition: background 0.3s;
}

.cta:hover {
  background-color: #00cc66;
}

.features {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 30px;
  max-width: 1000px;
  width: 100%;
}

.feature-card {
  background-color: #1e1e1e;
  border: 1px solid #00ff88;
  border-radius: 8px;
  padding: 20px;
  width: 280px;
  text-align: center;
  transition: transform 0.3s, box-shadow 0.3s;
}

.feature-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 0 15px #00ff8855;
}
</style>
