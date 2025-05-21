<template>
  <div class="dashboard">
    <h1>Welcome back, {{ user.name }}!</h1>
    <section>
      <h2>Your Progress</h2>
      <!-- Progress bar or chart here -->
    </section>
    <section>
      <h2>Enrolled Courses</h2>
      <!-- Use CourseCard component -->
    </section>
  </div>
</template>

<script setup>
const user = { name: 'Philani' } // Replace with actual user state
</script>

<style scoped>
.dashboard { color: white; padding: 20px; }
</style>