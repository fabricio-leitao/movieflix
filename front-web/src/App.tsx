import React from 'react';
import './App.scss';
import './core/assets/custom.scss';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Routes from './Routes';

const App = () => {
  return (
    <>
    <Routes/>
    <ToastContainer position="bottom-left" />
    </>
  );
}

export default App;
