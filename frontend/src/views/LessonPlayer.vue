<template>
  <div class="lesson-player">
    <h1>{{ lesson.title }}</h1>
    <video controls :src="lesson.videoUrl" />
    <p>{{ lesson.description }}</p>
  </div>
</template>

<script setup>
const lesson = {
  title: 'Understanding Reactivity',
  videoUrl: 'https://example.com/video.mp4',
  description: 'In-depth overview of Vue’s reactivity system.'
}
</script>

<style scoped>
.lesson-player { color: white; padding: 20px; }
video { width: 100%; max-width: 800px; margin-top: 20px; }
</style>