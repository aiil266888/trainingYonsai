
function Wrapper({children}){
    const style =  {
        border:'2px solid black',
        padding:'16px',     
    }
    return(
        <div style={style}>
            {children}
        </div>
    )
}

//기본값으로 Wrapper를 내보낸다
export default Wrapper;