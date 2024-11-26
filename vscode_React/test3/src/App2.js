import { useState } from "react";
import InputSample from "./InputSample";

function App(){
  const[likeCount, setLikeCount] = useState(0);
  return(
    <div>
      <InputSample/>
      <h1>좋아요 수 : {likeCount}</h1>
      <button  onClick={() => setLikeCount(likeCount +1)}>좋아요</button>
    </div>
  );
}

export default App;