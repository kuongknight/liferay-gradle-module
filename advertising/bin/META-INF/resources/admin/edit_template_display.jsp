<%@ include file="init.jsp" %>
<liferay-portlet:actionURL var="editTemplateURL" name="editTemplate">
</liferay-portlet:actionURL>
<liferay-ui:panel-container extended="<%= true %>" id="templateScriptContainer" markupView="lexicon" persistState="<%= true %>">
	<liferay-ui:panel collapsible="<%= true %>" extended="<%= true %>" id="templateScriptSectionPanel" markupView="lexicon" persistState="<%= true %>" title="script">
		<div class="form-group col-md-12">
			<div class="lfr-template-palette-container pull-left col-md-3"  id="<portlet:namespace />templatePaletteContainer">
				<div class="lfr-template-palette" id="<portlet:namespace />paletteDataContainer">
					<liferay-ui:panel collapsible="<%= true %>" id="variablrGr1"  cssClass="palette-section"  title="variable">
						<ul class="palette-item-content">
								<li class="palette-item-container">
									<span class="palette-item" data-content="$package">
										Package
									</span>
								</li>
								<li class="palette-item-container">
									<span class="palette-item" data-content="$items">
										Items
									</span>
								</li>
								<li class="palette-item-container">
									<span class="palette-item" data-content="$beginTime">
										Begin Time
									</span>
								</li>
								<li class="palette-item-container" >
									<span class="palette-item" data-content="$endTime">
										Expried Time
									</span>
								</li>
						</ul>
					</liferay-ui:panel>
				</div>
			</div>
			<div class="lfr-editor-container col-md-9" id="<portlet:namespace />editorContainer">
				<div class="lfr-rich-editor" id="<portlet:namespace />richEditor"></div>
			</div>
		</div>
	</liferay-ui:panel>
</liferay-ui:panel-container>
		
<aui:script use="aui-ace-autocomplete-freemarker,aui-ace-autocomplete-plugin,aui-ace-autocomplete-velocity,aui-toggler,aui-tooltip,autocomplete-base,autocomplete-filters,event-mouseenter,event-outside,liferay-util-window,resize,transition">
	var editorContentElement = A.one('#<portlet:namespace />content');
	var editorNode = A.one('#<portlet:namespace />richEditor');
	var richEditor;
	var prevEditorContent;
	A.on(
		'domready',
		function(event) {
			richEditor = new A.AceEditor(
				{
					boundingBox: editorNode,
					height: 400,
					mode: 'php',
					width: '100%'
				}
			).render();

			new A.Resize(
				{
					handles: ['br'],
					node: editorNode,
					on: {
						resize: resizeEditor
					}
				}
			);

			if (editorContentElement) {
				setEditorContent(editorContentElement.val());
			}
		},
		'#<portlet:namespace />richEditor'
	);
	
	A.all(".palette-item").each(function(){
		this.on("click", function(e){
			richEditor.insert(this.getAttribute("data-content"));
		});
	});
	
	function resizeEditor(event) {
		var info = event.info;
		richEditor.set('height', info.offsetHeight);
		richEditor.set('width', info.offsetWidth);
	}
	function setEditorContent(content) {
		richEditor.getSession().setValue(content);

		prevEditorContent = content;
	}
	function <portlet:namespace />getContent() {
		var content = richEditor.getSession().getValue();

		return content;
	}
	Liferay.provide(
	        window,
	        '<portlet:namespace />saveTemplate',
	    	function(isDraf) {
	        	var content = <portlet:namespace />getContent();
	        	if(content == null || content.length < 10){
	        		alert("Template content requied !");
	        		return;
	        	}
	        	if(isDraf){
	        		document.<portlet:namespace />fmTemplate.<portlet:namespace />isDraf.value = true;
	        	}
	    		document.<portlet:namespace />fmTemplate.action = '<%=editTemplateURL%>';
	    		document.<portlet:namespace />fmTemplate.target = '';
	    		document.<portlet:namespace />fmTemplate.<portlet:namespace />content.value = content;
	    		submitForm(document.<portlet:namespace />fmTemplate);
	    	}
	    );

</aui:script>