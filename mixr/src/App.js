import './App.css';
import one from './graphics/Additive Drink Layers/1.svg';
import two from './graphics/Additive Drink Layers/2.svg';
import three from './graphics/Additive Drink Layers/3.svg';
import four from './graphics/Additive Drink Layers/4.svg';
import five from './graphics/Additive Drink Layers/5.svg';
import six from './graphics/Additive Drink Layers/6.svg';
import seven from './graphics/Additive Drink Layers/7.svg';
import eight from './graphics/Additive Drink Layers/8.svg';
import nine from './graphics/Additive Drink Layers/9.svg';
import ten from './graphics/Additive Drink Layers/10.svg';
import eleven from './graphics/Additive Drink Layers/11.svg';
import twelve from './graphics/Additive Drink Layers/12.svg';
import thirteen from './graphics/Additive Drink Layers/13.svg';
import fourteen from './graphics/Additive Drink Layers/14.svg';
import fifteen from './graphics/Additive Drink Layers/15.svg';
import Button from './Search';
import Search from './Search';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <div className="split left"> 
        <div className="top">
          Mixer 
        </div>
        <div className="bottom">
          <div className="middle">
            <img src={fifteen} className="mixer-component" alt="logo" />
          </div>
        </div>
    
      </div>
      <div className="split right"> 
        Search 
        <Search></Search>
      </div>
        
      </header>
      
    </div>
  );
}

export default App;
