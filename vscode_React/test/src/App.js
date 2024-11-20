import './App.css';
import InputSample from './InputSample';
import InputSample1 from './InputSample1';
import InputSample2 from './InputSample2';
import InputSample3 from './InputSample3';
import UserList1 from './UserList1';
import CreateUser from './CreateUser';
import React, { useRef, useState } from 'react';

function App() {
  const [inputs, setInputs] = useState({
    username:'',
    email:''
  });
  const {username,email} = inputs;
  const onChange = (e) =>{
    const {name,value} = e.target;
    setInputs({
      ...inputs,
      [name]:value
    });
  };
  const [users,setUsers] = useState([
    {
       id: 1,
       username: 'velopert',
       email: 'hello@gmail.com'
     },
     {
       id: 2,
       username: 'tester',
       email: 'bye@naver.com'
     },
     {
       id: 3,
       username: 'liz',
       email: 'world@hanmail.com'
     }
]);
const nextId = useRef(4);
const onCreate = () =>{
  const user = {
    id : nextId.current,
    username,
    email
  };
setUsers(users.concat(user));
  
  setInputs({
    username:'',
    email:'' 
  });
  nextId.current +=  1;
};

  return (
    <>
      <CreateUser
      username={username}
      email={email}
      onChange={onChange}
      onCreate={onCreate}
      />
      <UserList1 users={users}/>
    </>
  );
}

export default App;
