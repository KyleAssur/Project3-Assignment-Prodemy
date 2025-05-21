import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Signup from '../views/Signup.vue'
import AboutUs from '../views/AboutUs.vue'
import Courses from '../views/Courses.vue'
import Dashboard from '../views/Dashboard.vue'
import CourseDetail from '../views/CourseDetail.vue'
import MyCourses from '../views/MyCourses.vue'
import LessonPlayer from '../views/LessonPlayer.vue'
import ProfileSettings from '../views/ProfileSettings.vue'
import ContactSupport from '../views/ContactSupport.vue'

const routes = [
    { path: '/', name: 'Home', component: Home },
    { path: '/login', name: 'Login', component: Login },
    { path: '/signup', name: 'Signup', component: Signup },
    { path: '/about-us', name: 'AboutUs', component: AboutUs },
    { path: '/courses', name: 'Courses', component: Courses },
    { path: '/dashboard', name: 'Dashboard', component: Dashboard },
    { path: '/courses/:id', name: 'CourseDetail', component: CourseDetail },
    { path: '/my-courses', name: 'MyCourses', component: MyCourses },
    { path: '/lesson/:lessonId', name: 'LessonPlayer', component: LessonPlayer },
    { path: '/profile', name: 'ProfileSettings', component: ProfileSettings },
    { path: '/contact', name: 'ContactSupport', component: ContactSupport },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router
