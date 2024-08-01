import { createRouter, createWebHistory } from 'vue-router';
import HomePage from '../components/Home.vue';
import SeatingChartPage from '../components/SeatingChart.vue';

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomePage
  },
  {
    path: '/seating-chart',
    name: 'seating-chart',
    component: SeatingChartPage
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;