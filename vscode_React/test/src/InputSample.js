import {useState} from "react";

function InputSample(){

    //useState훅을 사용하여 text라는  상태를 관리한다 
    //text의 초기값은 빈문자열()
    const  [text,setText] = useState('');
    const onChange = (e) => {  //입력필드에 값이 변경(쓰거나 지우거나)될 때 호출된다 
        //이벤트객체 e를 통해 입력필드의 현재값을 가져와 text상태를 업데이트한다 
        setText(e.target.value);
    }

    //입력필드 초기화
    const onReset = () => { 
        setText('');
    }
    return(
        <div>
            <input onChange={onChange} value={text} />
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값 :{text} </b>
            </div>
        </div>
    );
    
}
export default InputSample;