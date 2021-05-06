import React from 'react';
import './App.scss';
import './core/assets/custom.scss';
import Navbar from './core/components/Navbar';
import Login from './pages/Auth/Login';

const App = () => {
  return (
    <>
    <Navbar/>
    <Login/>
    </>
  );
}

export default App;
