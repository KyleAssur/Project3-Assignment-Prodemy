<template>
  <div class="courses-page">
    <h1>Explore <span class="brand">Courses</span></h1>
    <p class="subtitle">Boost your skills with our curated productivity and tech tracks.</p>

    <div class="courses-grid">
      <div class="course-card" v-for="course in courses" :key="course.id">
        <h2>{{ course.title }}</h2>
        <p>{{ course.description }}</p>
        <router-link :to="`/courses/${course.id}`" class="enroll-btn">View Course</router-link>
      </div>
    </div>
  </div>
</template>

<script setup>
const courses = [
  {
    id: 1,
    title: "Productivity Mastery",
    description: "Learn powerful strategies and tools to manage your time and tasks efficiently.",
  },
  {
    id: 2,
    title: "Web Development Essentials",
    description: "Master HTML, CSS, and JavaScript to build responsive and interactive websites.",
  },
  {
    id: 3,
    title: "Time Management Techniques",
    description: "Explore proven methods like Pomodoro, Eisenhower Matrix, and more.",
  },
  {
    id: 4,
    title: "Introduction to Python",
    description: "Start coding with Python and build your foundation in programming.",
  },
];
</script>

<style scoped>
.courses-page {
  max-width: 1100px;
  margin: 60px auto;
  padding: 20px;
  color: white;
  text-align: center;
}

.brand {
  color: #00ff88;
}

.subtitle {
  color: #ccc;
  margin-bottom: 40px;
}

.courses-grid {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 30px;
}

.course-card {
  background-color: #1e1e1e;
  border: 1px solid #00ff88;
  border-radius: 8px;
  padding: 20px;
  width: 280px;
  text-align: left;
  transition: transform 0.3s, box-shadow 0.3s;
}

.course-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 0 15px #00ff8855;
}

.enroll-btn {
  display: inline-block;
  margin-top: 15px;
  padding: 8px 16px;
  background-color: #00ff88;
  color: #121212;
  border-radius: 4px;
  text-decoration: none;
  font-weight: bold;
  transition: background 0.3s;
}

.enroll-btn:hover {
  background-color: #00cc66;
}
</style>
