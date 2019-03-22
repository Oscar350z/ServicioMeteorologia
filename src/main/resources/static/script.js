
function iniciarMap(){
	
	console.log("Prueba");
//	/*<![CDATA[*/var results = /*[[${meteodata}]]*/;
//
///*]]>*/
	console.log("Prueba");
    
    var coord = {lat: 40.4165, lng: -3.70256};
	
    console.log("Pintar results: ");
	var map = new google.maps.Map(document.getElementById('map'),{
		zoom: 10,
		center: coord
	});
	var marker = new google.maps.Marker({
		position: coord,
		map: map
	});
	
	// Loop through the results array and place a marker for each
    // set of coordinates.
    window.eqfeed_callback = function(results) {
    	console.log("Pintar algo");
      for (var i = 0; i < results.listaEstaciones.length; i++) {
        var latLng = new google.maps.LatLng(results.listaEstaciones[i].lat,results.listaEstaciones[i].lng);
        var title = results.listaEstaciones[i].stationName;
        console.log("Pintar algo");
        console.log(title);
        var marker = new google.maps.Marker({
          position: latLng,
          map: map,
          title: title
        });
      }
    }
}