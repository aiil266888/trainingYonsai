import {useState,useRef} from "react";

function InputSample3(){
    const [inputs,setInputs] = useState({
        name:'',
        nickname:'',
        email:''
    });
    const nameInput = useRef();

    const {name,nickname,email} = inputs; //비구조화 할당으로 값을 추출
    const onChange = (e) =>{ //타자쳐서 변경된 내용이 있으면 바로 e로전달
        const {value, name} = e.target;//e.target에서 name과 value추출
        setInputs({
            ...inputs,//기존의 값을 불러와라
            [name]:value, //name의 키값을 업데이트
        });
    }
    const onReset = (e) =>{
        setInputs({
            name:'',
            nickname:'',
            email:''
        });

        nameInput.current.focus();//input창을 클릭해서 커서를 깜빡
    }
    return(
        <div>
            <input name="name" placeholder="이름" onChange={onChange} value={name} ref={nameInput} />
            <input name="nickname" placeholder="닉네임" onChange={onChange} value={nickname} />
            <input name="email" placeholder="이메일" onChange={onChange} value={email} />
            <button onClick={onReset}>초기화</button>
            <div>
                <b>이름: {name}</b>
                <b>닉네임: {nickname}</b>
                <b>이메일: {email}</b>
            </div>
        </div>
    ); 
}
export default InputSample3;