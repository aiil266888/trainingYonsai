function ProductCard(props){
    const cardStyle={
        backgroundColor : props.inStock ? 'white':'lightgray',
        padding: '10px',
        margin: '10px',
        borderRadius:'7px',
        border:'2px solid green',
    };
    return(
        <div style={cardStyle}>
            <h2>제품명 : {props.productName}</h2>
            <p>가격 : {props.price}</p>
            <p>설명 : {props.description}</p>
            <p>재고 :  {props.inStock ? "있음":"품절"}</p>
        </div>
    );
};

//기본값 설정
ProductCard.defaultProps = {
    productName: "상품명 없음",
    price: "가격 정보 없음",
    description: "설명 없음",
    inStock: false,
};
export default ProductCard;