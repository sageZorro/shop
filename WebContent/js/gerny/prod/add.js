$(function() {
	$.get("/category/list", {level:"1",status:"1"}, function(data){
		 for ( var i = 0; i < data.length; i++) {
             $("#prod_add_select1").append("<option data-id="+data[i].id+">"+data[i].zh+"</option>");
         }   
		 //级联二级类目
		init2();
	})
	
	
	function init2(){
		 $("#prod_add_select1 > option").on("click", function(){
			 	$("#prod_add_select2").empty();$("#prod_add_select3").empty();
				var parentId = $(this).data('id');
				$.get("/category/list", {parentId:parentId}, function(data){
					 for ( var i = 0; i < data.length; i++) {
			             $("#prod_add_select2").append("<option data-id="+data[i].id+">"+data[i].zh+"</option>");
			         }       
					 init3();
				})
			});
	}
	
	function init3(){
		 $("#prod_add_select2 > option").on("click", function(){
			 	$("#prod_add_select3").empty();
				var parentId = $(this).data('id');
				$.get("/category/list", {parentId:parentId}, function(data){
					 for ( var i = 0; i < data.length; i++) {
			             $("#prod_add_select3").append("<option data-id="+data[i].id+">"+data[i].zh+"</option>");
			         }       
				})
			});
		
	}
	
});

