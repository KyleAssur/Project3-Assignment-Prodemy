<template>
  <div class="about">
    <h1>About <span class="brand">Prodemy</span></h1>
    <p>
      Prodemy is an innovative platform focused on empowering individuals with the skills and tools they need to thrive in today’s fast-paced digital world.
    </p>

    <div class="cards">
      <div class="card">
        <h2>🌱 Our Mission</h2>
        <p>To help people become more productive by learning real, applicable skills.</p>
      </div>
      <div class="card">
        <h2>💡 Our Vision</h2>
        <p>To be the go-to platform for lifelong learners who want to level up their careers.</p>
      </div>
      <div class="card">
        <h2>🤝 Our Values</h2>
        <p>We believe in community, continuous growth, and accessible education for all.</p>
      </div>
    </div>
  </div>
</template>

<script setup>
</script>

<style scoped>
.about {
  max-width: 900px;
  margin: 60px auto;
  padding: 20px;
  color: white;
  text-align: center;
}

.brand {
  color: #00ff88;
}

.cards {
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
  margin-top: 40px;
  justify-content: center;
}

.card {
  background-color: #1e1e1e;
  border: 1px solid #00ff88;
  border-radius: 8px;
  padding: 20px;
  width: 280px;
  text-align: left;
  transition: transform 0.3s, box-shadow 0.3s;
}

.card:hover {
  transform: translateY(-5px);
  box-shadow: 0 0 10px #00ff8855;
}
</style>
