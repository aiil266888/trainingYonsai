import Hello from "./Hello";
import Wrapper from "./Wrapper";
import UserCard from "./UserCard";
import './App.css'

function App(){
  const name = 'react';
  const style = {
    backgroundColor:'black',
    color:'aqua',
    fontSize:24,
    padding:'1rem'
  } 
//Hello.js를 불러오고 name변수안의 react를 출력하는데 
//style설정은 변수 style안에 써있는대로 불러온다
  // return(
  //   <div>
  //     <Wrapper>
  //     <Hello name = "react" color="pink" isSpecial={true}/>
  //     {/* 이름안주면 Hello.js 에 지정한 기본값(이름없음)으로 할당 */}
  //     <Hello color = "red"/>
  //     <Hello name="abc" color="blue" isSpecial/>
  //     </Wrapper>
  //     {/* 주석은 이렇게 사용 */}
  //     {/* <div style={style}>{name}</div>
  //     <div className="lime-box"></div> */}
  //   </div>
  // );

  return(
    // <UserCard name="Alice" age={30} location="New York"/>
    <UserList/>
  );
}
export default App;