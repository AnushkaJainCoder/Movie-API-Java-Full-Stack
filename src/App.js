import logo from './logo.svg';
import './App.css';
import api from './api/axiosConfig'
import layout, { Layout } from './components/Layout'
import {Routes, Route} from 'react-router-dom'
import Home from './components/home/Home'

import { useState, useEffect } from 'react';
import Header from './components/header/header';
import Trailer from './components/Trailer/trailer';

function App() {

  const [movies, setMovies] = useState();
  const getMovies = async() => {

    try {

      const res = await api.get("/api/vi/movies");
      console.log(res.data);
      setMovies(res.data);

    } catch (error) {

      console.log(error);

    }
  }

  useEffect(() => {
    getMovies();
  },[])

  return (
    <div className="App">
      <Header></Header>
      <Routes>
        <Route path="/" element={<Layout />} >
          <Route path="/"  element= {<Home movies={movies} />} ></Route>
          <Route path='/Trailer/:ytTrailerId' element={<Trailer />}></Route>

        </Route>
      </Routes>
    </div>
  );
}

export default App;
