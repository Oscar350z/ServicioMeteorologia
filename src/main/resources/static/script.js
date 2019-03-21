/**
 * 
 */


function iniciarMap(){
	
	var coord = {lat: 40.4165, lng: -3.70256};
	var map = new google.maps.Map(document.getElementById('map'),{
		zoom: 10,
		center: coord
	});
	var marker = new google.maps.Marker({
		position: coord,
		map: map
	});
}