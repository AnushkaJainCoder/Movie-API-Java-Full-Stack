import axios from 'axios';

export default axios.create({
    baseURL:'http://localhost:9090',
    // http://localhost:9090/api/vi/reviews
    headers: {"ngrok-skip-browser-warning":"true"}
})