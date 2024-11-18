import UserCard from "./UserCard";

function UserList(){

    const users =[
        {name:"강백호", position:"DH", from:"KT WIZ", isActive: true},
        {name:"김도영", position:"3rd", from:"KIA TIGERS", isActive: true},
        {name:"노시환", position:"3rd", from:"HANHWA EAGLES", isActive: false},
        {name:"구자욱", from:"SAMSUNG LIONS", isActive: true},
    ];
    return(
        <div>
            <h1>목록</h1>
            {users.map((user, index)=>(
            <UserCard key={index} name={user.name} position={user.position} from={user.from} isActive={user.from}/>
            ))}
        </div>
        
    );
}
export default UserList;