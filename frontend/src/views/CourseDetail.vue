<template>
  <div class="course-detail" v-if="course">
    <h1>{{ course.title }}</h1>
    <p>{{ course.description }}</p>

    <section>
      <h2>Syllabus</h2>
      <ul>
        <li v-for="(module, index) in course.modules" :key="index">
          {{ module }}
        </li>
      </ul>
    </section>
  </div>
  <div v-else class="not-found">
    <p>Course not found.</p>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { useRoute } from 'vue-router'

const route = useRoute()
const courseId = parseInt(route.params.id)

const courses = [
  {
    id: 1,
    title: "Productivity Mastery",
    description: "Learn powerful strategies and tools to manage your time and tasks efficiently.",
    modules: ["Time Blocking", "Eisenhower Matrix", "Task Batching"]
  },
  {
    id: 2,
    title: "Web Development Essentials",
    description: "Master HTML, CSS, and JavaScript to build responsive and interactive websites.",
    modules: ["HTML Basics", "CSS Styling", "JavaScript Fundamentals"]
  },
  {
    id: 3,
    title: "Time Management Techniques",
    description: "Explore proven methods like Pomodoro, Eisenhower Matrix, and more.",
    modules: ["Pomodoro Technique", "80/20 Rule", "Task Prioritization"]
  },
  {
    id: 4,
    title: "Introduction to Python",
    description: "Start coding with Python and build your foundation in programming.",
    modules: ["Variables & Data Types", "Control Flow", "Functions"]
  }
]

const course = ref(null)

onMounted(() => {
  course.value = courses.find(c => c.id === courseId)
})
</script>

<style scoped>
.course-detail {
  color: white;
  padding: 20px;
}

.not-found {
  color: white;
  padding: 20px;
  text-align: center;
}
</style>
