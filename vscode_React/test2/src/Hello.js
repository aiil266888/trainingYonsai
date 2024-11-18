

function Hello({color,name}){
    return (
        <div style={{color}}>HELLO WORLD! {name} 님</div>
    );
}

Hello.defaultProps = {
    name : 'GUEST',
}
export default Hello;
