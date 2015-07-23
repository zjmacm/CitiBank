var htmlInPublishBox = [
	'',
	''
];

function closeBox() {
	$('#publishBox').fadeOut();
	$('#screencover').fadeOut();
}

function createCover() {
	$('#mainContainer').append('<div id="screencover"></div>');

	$('#screencover').attr({
		tabIndex: '-1'
	});

	$('#screencover').css({
		width: '100%',
		height: '100%',
		border: '0px',
		backgroundColor: 'white',
		top: '0px',
		left: '0px',
		position: 'fixed',
		opacity: '0.5',
		zIndex: '10000',
		display: 'none'
	});

}

function makeWindow() {
	var mainBox = $('#main');

	mainBox.append('<div id="publishBox"></div>');
	var box = $('#publishBox');

	box.css({
		width: '621px',
		height: '375px',
		position: 'absolute',
		left: '100px',
		top: '90px',
		zIndex: '10001',
		backgroundImage: 'url("../public/images/boxbg.png")',
		display: 'none'
	});

	box.append('<div id="publishBoxCloseButtonBox"></div>');

	var closeButtonBox = $('#publishBoxCloseButtonBox');

	var closeButton =
		'<a herf="javascript:void(0);" onclick="closeBox()">' +
			'<img src="../public/images/cancel.png">' +
		'</a>';

	var closeButton = closeButtonBox.append(closeButton);

	$('#publishBoxCloseButtonBox').css({
		cursor: 'pointer',
		position: 'absolute',
		top: '15px',
		left: '587px'
	});

	$('#publishBox').append('<p id="boxTitle">发布更多信息</p>');
	$('#boxTitle').css({
		color: 'white',
		position: 'absolute',
		top: '-5px',
		left: '10px'
	});



	return box;
}

function addTypeSelectBox (windowBox) {
	windowBox.append('<div id="typeSelectContainer"></div>');

	var typeSelectBox = $('#typeSelectContainer');

	typeSelectBox.append('<p style="display: inline">选择上传文件类型</p>');
	typeSelectBox.append('<input id="forImage" class="inPublishBox" type="radio">图片');
	typeSelectBox.append('<input id="forFile" class="inPublishBox"  type="radio">文件');

	$('input.inPublishBox').css({
		marginLeft: '50px'
	});

	$('#forImage').click();

	typeSelectBox.css({
		color: '#2A324B',
		position: 'absolute',
		top: '50px',
		left: '15px'
	})
}

function addContentSelectBox (windowBox) {
	windowBox.append('<div id="contentSelectBox"></div>');

	var contentSelectBox = $('#contentSelectBox');
	contentSelectBox.css({
		width: '555px',
		height: '205px',
		position: 'absolute',
		top: '100px',
		left: '20px'
	});

	contentSelectBox.append('<div id="forSelectedBox"></div>');
	contentSelectBox.append('<div id="selectedBox"></div>');

	var forSelectedBox = $('#forSelectedBox');
	var selectedBox = $('#selectedBox');

	forSelectedBox.css({
		width: '354px',
		height: '205px',
		backgroundImage: 'url("../public/images/forSelected.png")',
		position: 'absolute',
		left: '0px',
		top: '0px'
	});

	selectedBox.css({
		width: '193px',
		height: '205px',
		backgroundImage: 'url("../public/images/selected.png")',
		position: 'absolute',
		left: '362px',
		top: '0px'
	});

	var titleStyle =
		'font-size:2px;' +
		'top:-25px;' +
		'left:12px;' +
		'color:#2A324B;' +
		'position:absolute;';

	selectedBox.append('<p style="' + titleStyle + '">已选择</p>');
}

function createBox() {
	var box = makeWindow();
	addTypeSelectBox(box);
	addContentSelectBox(box);
}

function setEvent() {
	$('#screencover').click(closeBox);

	$('#forImage').click(function() {
		$('#forFile').attr({
			checked: false
		});

		addContentSelectBox(0);
	});

	$('#forFile').click(function() {
		$('#forImage').attr({
			checked: false
		});

		addContentSelectBox(1);
	});
}

function startWidget () {
	if ($('#screencover').length <= 0 || $('#publishBox').length <= 0) {
		createCover();
		createBox();
		setEvent();
	}

	$('#screencover').fadeIn();
	$('#publishBox').fadeIn();
	
	
}

