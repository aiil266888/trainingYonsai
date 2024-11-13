import Hello from "./Hello";
import './App.css'

function App(){
  const name = 'react';
  const style = {
    backgroundColor:'black',
    color:'aqua',
    fontSize:24, //기본단위
    padding:'1rem'
  } 
//Hello.js를 불러오고 name변수안의 react를 출력하는데 
//style설정은 변수 style안에 써있는대로 불러온다
  return(
    <div>
    {/* 주석은 이렇게 사용 */}
    /* 중괄호로 감싸지 않으면 주석이 화면에 출력 */
      <Hello/>
      <div style={style}>{name}</div>
      <div className="lime-box"></div>
    </div>
  );
}
export default App;