<%@ page contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script src="<%=basePath%>js/gerny/prod/add.js"></script>
<section class="content">
	<div class="row">
    	<div class="col-md-4">
         <div class="form-group">
           <label>一级类目</label>
           <select id="prod_add_select1" class="form-control select2" multiple="multiple" data-placeholder="Select a State" style="width: 100%;height: 200px">
             
           </select>
         </div>
     
         <!-- /.form-group -->
       </div>
            <!-- /.col -->
       <div class="col-md-4">
         <div class="form-group">
           <label>二级类目</label>
           <select id="prod_add_select2" class="form-control select2" multiple="multiple" data-placeholder="Select a State" style="width: 100%;height: 200px">
            
           </select>
         </div>
       </div>
       <div class="col-md-4">
         <div class="form-group">
           <label>三级类目</label>
           <select id="prod_add_select3" class="form-control select2" multiple="multiple" data-placeholder="Select a State" style="width: 100%;height:200px">
            
           </select>
         </div>
       </div>
		<!-- /.col -->
	</div>
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
	          <li><a href="#"><i class="fa fa-hand-o-right"></i> 您选择的类目:</a></li>
	          <li><a href="#">第一类</a></li>
	          <li >第二类</li>
	          <li class="active">第三类</li>
	        </ol>
		</div>
	
	</div>
	
	<form class="form-horizontal">
       <!-- 基本信息 -->    
	<div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title">基本信息</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body" style="display: block;">
          <div class="row">
            <div class="col-md-6">
             	<div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 control-label">商品名称：</label>

                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                  </div>
                </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
            	<div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 control-label">广告词：</label>

                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                  </div>
                </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
       
    </div>
    <!-- 商品属性 -->
	<div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title">商品属性</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body" style="display: block;">
          <div class="row">
            <div class="col-md-12">
             	<div class="form-group">
                <label class="col-sm-1 control-label">品牌</label>
                <div class="col-sm-11">
                     <select class="form-control select2" style="width: 100%;">
	                  <option selected="selected">Alabama</option>
	                  <option>Alaska</option>
	                  <option>California</option>
	                  <option>Delaware</option>
	                  <option>Tennessee</option>
	                  <option>Texas</option>
	                  <option>Washington</option>
               		</select>
                 </div>
              </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-12">
            	<div class="form-group">
                <label class="col-sm-1 control-label">大小</label>
                <div class="col-sm-11">
                     <select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true">
	                  <option selected="selected">Alabama</option>
	                  <option>Alaska</option>
	                  <option>California</option>
	                  <option>Delaware</option>
	                  <option>Tennessee</option>
	                  <option>Texas</option>
	                  <option>Washington</option>
               		</select>
                 </div>
               
                
              </div>
              <!-- /.form-group -->
            </div>
			<div class="col-md-12">
				<div class="form-group">
					<label class="col-sm-1 control-label">颜色:</label>
					<div class="col-sm-11">
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						
					</div>
				</div>
			</div>

					<!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
       
    </div>
    <!-- 商品信息 -->
    <div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title">商品信息</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body" style="display: block;">
          <div class="row">
            <div class="col-md-6">
             	<div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 control-label">商品名称：</label>

                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                  </div>
                </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
            	<div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 control-label">广告词：</label>

                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                  </div>
                </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
       
    </div>
    <!-- 销售属性 -->
    <div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title">销售属性</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body" style="display: block;">
          <div class="row">
           
			<div class="col-md-12">
				<div class="form-group">
					<label class="col-sm-1 control-label">颜色:</label>
					<div class="col-sm-11">
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<label class="col-sm-1 control-label">颜色:</label>
					<div class="col-sm-11">
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<label class="col-sm-1 control-label">颜色:</label>
					<div class="col-sm-11">
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						<label> <input type="checkbox" class="flat-red" checked> 黄色    </label> 
						
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<table class="table table-bordered">
                <tr>
                  <th style="width: 10px">#</th>
                  <th>Task</th>
                  <th>Progress</th>
                  <th style="width: 40px">Label</th>
                </tr>
                <tr>
                  <td>1.</td>
                  <td>Update software</td>
                  <td>
                    <div class="progress progress-xs">
                      <div class="progress-bar progress-bar-danger" style="width: 55%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-red">55%</span></td>
                </tr>
                <tr>
                  <td>2.</td>
                  <td>Clean database</td>
                  <td>
                    <div class="progress progress-xs">
                      <div class="progress-bar progress-bar-yellow" style="width: 70%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-yellow">70%</span></td>
                </tr>
                <tr>
                  <td>3.</td>
                  <td>Cron job running</td>
                  <td>
                    <div class="progress progress-xs progress-striped active">
                      <div class="progress-bar progress-bar-primary" style="width: 30%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-light-blue">30%</span></td>
                </tr>
                <tr>
                  <td>4.</td>
                  <td>Fix and squish bugs</td>
                  <td>
                    <div class="progress progress-xs progress-striped active">
                      <div class="progress-bar progress-bar-success" style="width: 90%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-green">90%</span></td>
                </tr>
              </table>
			
			
			</div>
					<!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
       
    </div>
    <!--  -->
    <div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title">商品图片</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body" style="display: block;">
          <div class="row">
            
          </div>
          <!-- /.row -->
        </div>
       
    </div>
    <div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title">商品描述</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body" style="display: block;">
          <div class="row">
            
          </div>
          <!-- /.row -->
        </div>
       
    </div>
    
    
	</form>
	<!-- /.row -->
</section>



<!-- Modal -->
<div class="modal fade" id="user_edit_modal" tabindex="-1" role="dialog" >
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 id="user_edit_title" class="modal-title"></h4>
      </div>
      <div class="modal-body">
         <form id="user_edit_form" role = "form" class="form-horizontal"> 
         		
         	  <input type = "hidden"  name = "userid"></input> 	
			  <div class = "form-group"> 
			   <label class="col-sm-2 control-label" for = "username">用户名</label> 
			   <div class="col-sm-10"> 
			    <input type = "text" class = "form-control" name = "username"
			     placeholder = "请输入用户名"></input> 
			   </div> 
			  </div>
			  <div class = "form-group"> 
			   <label class="col-sm-2 control-label" for = "password">密码</label> 
			   <div class="col-sm-10"> 
			    <input type = "password" class = "form-control" name = "password"
			     placeholder = "请输入密码"></input> 
			   </div> 
			  </div>
			   <div class = "form-group"> 
			   <label class="col-sm-2 control-label" for = "truename">真实姓名</label> 
			   <div class="col-sm-10"> 
			    <input type = "text" class = "form-control" name = "truename"
			     placeholder = "请输入用户名"></input> 
			   </div> 
			  </div>
			  <div class = "form-group"> 
			   <label class="col-sm-2 control-label" for = "phone">电话号码</label> 
			   <div class="col-sm-10"> 
			    <input type="text" class="form-control" name = "phone"
			      placeholder = "请输入电话号码"></input> 
			   </div> 
			  </div> 
			  <div class = "form-group"> 
			   <label class="col-sm-2 control-label" for = "mobile">手机</label> 
			   <div class="col-sm-10"> 
			    <input type="text" class="form-control" name = "mobile"
			      placeholder = "请输入电话号码"></input> 
			   </div> 
			  </div> 
			 
			<!--   <div class = "form-group"> 
			   <label class="col-sm-2 control-label" for = "idCard">请上传身份证</label> 
			   <div class="col-sm-10"> 
			    <input type = "file" id = "idCard" style="display:inline-block;"></input> 
			   </div> 
			  </div> 
			  <div class = "form-group"> 
			   <label class="col-sm-2 control-label" for = "profession">选择职业</label> 
			   <div class="col-sm-10"> 
			    <select id = "profession" class = "form-control"> 
			     <option>软件工程师</option> 
			     <option>测试工程师</option> 
			     <option>硬件工程师</option> 
			     <option>质量分析师</option> 
			    </select> 
			   </div> 
			  </div>  -->
			 </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-primary" onclick="user_edit_submit()">保存</button>
      </div>
    </div>
  </div>
</div>


<div class="modal fade" id="user_confirm_modal" tabindex="-1" role="dialog" >
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 id="user_edit_title" class="modal-title"></h4>
      </div>
      <div class="modal-body">
        您确定要删除该用户么？
      </div>
      <div class="modal-footer">
        <button type="submit" class="btn btn-primary" onclick="user_remove_submit()">确定</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>