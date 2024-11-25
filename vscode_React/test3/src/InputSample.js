import { useState } from "react";

function InputSample(){
    const[inputs, setInputs] = useState({
        name:'' ,
        nickname:'',
        email:''
    });
   const {name , nickname, email} = inputs; //비구조화 할당을 통해 값 추출
 
    const onChange = (e) =>{ //키보드를 사용하여 입력 삭제 됬을때
        const {value, name} = e.target; // 우선  e.target에서 name과 value를 추출
        console.log(e.target.value);
        setInputs({
            ...inputs,//기존의 input객체를 복사한 뒤 
            [name]:value//키를 가지는 값을 value로 설정 (원래써놨던거 안지워지게하는거임)
        });
    }

    const onReset = () =>{
        setInputs({
            name:'',
            nikname:'',
            email:''
        });
    }
    return(
        <div>
            <input name="name" placeholder="이름" onChange={onChange} value={name}/>
            <input name="nickname" placeholder="닉네임" onChange={onChange} value={nickname}/>
            <input name="email" placeholder="이메일" onChange={onChange} value={email}/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: </b>
                {name} ({nickname}){email}
            </div>
        </div>
    );
}
export default InputSample;