function MultiInputFom (){
    const[formData, setFormData] =useState({
        name:"",
        email:""
    });
    //입력값이 변경될 떄 상태를 업더ㅔ이트하는 핸들러
   

    const handleSubmit = (e) =>{
        //입력필드의 입력값 가져오기
        const {name, value} = e.target;   
        e.preventDefault();
        console.log("Submit data",formData);//현재상태 콘솔 출력
    }
    return(
        <div>
            <h2>멀티 인풋폼</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>name:
                        <input
                        text="text"
                        name="name"
                        value={FormData.name}
                        onChange={handleChange} //상태 업데이트 핸들러 
                        />
                    </label>
                </div>
                <button type="submit">전송하기</button>
            </form>
            <div>
                <h3>현재 인풋창에 나오는 내용</h3>
            </div>
        </div>
    );
}
export default MultiInputFom