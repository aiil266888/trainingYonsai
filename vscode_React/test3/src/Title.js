//function Title(props){
function Title({title,text}){
    return(
        // <div><h2 className="title">Hello World!</h2>
        //     <h4>{props.title}</h4>
        // </div>
         <div>
         <h2 className="title">{title}</h2>
         <p>{text}</p>
     </div>
    );
}
export default Title;
//props란? > 부모의 컴포넌트가 자식 컴포넌트에게 넘겨주는 데이터 
//무조건 부모가! 자식에게! 줘야함 순서중요 
//App.js => 라는 부모컴포넌트가 
//Title.js =>라는 자식 컴포넌트에게
//title={"hello Korea"} 라는 props를 넘겨준 상황
//props title 이라는 key값에 App.js에서 전달한 hello Korea라는 텍스트를 
//value로 가지는 객체라는걸 확인가능