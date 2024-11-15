
function UserCard(props){
    const cardStyle={
        backgroundColor: props.isActive ? 'lightgreen' : 'lightblue',
        padding:'10px',
        margin:'10px',
        borderRadius: '5px'
    }

    return (
        <div style={cardStyle}>
            <h2>{props.name}</h2>
            <p>Age : {props.age}</p>
            <p>Job : {props.job}</p>
            <p>State: {props.isActive ? "활성"  : "비활성"}</p>
        </div>
    );
}

UserCard.defaultProps = {
    name:"이름 없음",
    age:"나이 정보 없음",
    job:"직업 정보 없음"
}
export default UserCard;