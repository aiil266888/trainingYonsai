function UserCard(props){
    const cardStyle={
        backgroundColor : props.isActive ? 'white':'lightgray',
        padding: '10px',
        margin: '10px',
        borderRadius:'5px',
        border:'2px solid black',
    }
    return(
        <div style={cardStyle}>
            <h2>이름 : {props.name}</h2>
            <p>포지션 : {props.position}</p>
            <p>소속 : {props.from}</p>
            <p>상태 :  {props.isActive ? "활성":"비활성"}</p>
        </div>
    );
}

//기본값 설정 
UserCard.defaultProps = {
    name:"이름없음",
    position: "정보없음",
    from: "소속없음"
}
export default UserCard;