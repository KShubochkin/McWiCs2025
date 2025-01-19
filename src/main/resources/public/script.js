

document.getElementById("addItem").addEventListener("click", function () => {};
});
async function fetchInventory(){
    try{
        const response = await fetch("/api/inventory");
        const inventory =
        if (!response.ok){
            throw new Error('Response status: ${response.status}');
        }
    } catch(error){
        console.error(error.message);
    }
}
function addItem(){
    const food = prompt("Enter food item to add");
    localStorage.setItem("food", food);

}
fetch("/api/inventory")
    .then(response => response.json())
    .then(data => {
        alert(data.message); // Show the message in an alert box
    })
    .catch(error => console.error("Error:", error));

const addItemButton = document.querySelector('#addItem');
const addButton=document.querySelector('#add-item-btn');
const viewInventoryButton=document.querySelector('#viewInventory');
const addName=document.querySelector('#itemName');
const addQuantity =document.querySelector('#itemQuantity');
addButton.addEventListener("click", ()=>{
    const item = addName.value;

})