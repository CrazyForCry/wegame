	$(".g-head-left>ul>li:last").hover(function(){
			$(".g-head-left>ul>li:last>ul").show();
		},function(){
			$(".g-head-left>ul>li:last>ul").hide();
		})
		
//		js:g-ad
		$(".g-ad>a:last").click(function(){
			if($(".g-ad").css("overflow") == "visible"){
				$(".g-ad").css({
					height:"150px",
					overflow:"hidden"
				})
				$(".g-ad>a:last>span").removeClass("iconfont icon-iconfonticontrianglecopy");
				$(".g-ad>a:last>span").addClass("iconfont icon-jiantou9");
				$(this).css({
					bottom:"430px"
				})
			}else{
				$(".g-ad").css({
					height:"568px",
					overflow:"visible"
				})
				$(".g-ad>a:last>span").removeClass("iconfont icon-jiantou9");
				$(".g-ad>a:last>span").addClass("iconfont icon-iconfonticontrianglecopy")
				$(this).css({
					bottom:"15px"
				})	
			}
	
		});
	
		

//		js:轮播图
		$(function(){
			var i = 0; //当前图片索引
			var timer = null; //定时器
			var changeTime = 3000; //间隔时间
			var height = 392; //每张图宽度
			var speed = 800; //动画时间
			
			//克隆第一张追加到最后 设置ul高度为图片数 * 图片高度
			var firstimg = $('.m-swiper-swiperItem li').first().clone();
			$('.m-swiper-swiperItem').append(firstimg).height($('.m-swiper-swiperItem li').length * height);
			
			//设置定时器
			timer = setInterval(imgChange,changeTime);
			
			//鼠标移入暂停自动，移出自动
			$('.m-swiper').hover(function(){
				clearInterval(timer);
			},function(){
				timer = setInterval(imgChange,changeTime);
			})
			
			//鼠标划入右侧标识
			$('.m-swiper-splot li').mouseenter(function(){
				i = $(this).index();
				$('.m-swiper-swiperItem').stop().animate({
					top: -i * height
				},200);
				spoltChange();
			})
			
			//自动播图 imgChange()函数
			function imgChange(){
				++i;
				carouselImg();
				spoltChange();
			}
			//无缝轮播 carouselImg()函数
			function carouselImg(){
				if(i == $('.m-swiper-swiperItem li').length){
					i = 1;
					$('.m-swiper-swiperItem').css({
						top:0
					})
				}
				
				$('.m-swiper-swiperItem').stop().animate({
					top:-i * height
				},speed);
			}
			//自动切换右侧标识spoltChange()函数
			function spoltChange(){
				if(i == $('.m-swiper-swiperItem li').length - 1){
					$('.m-swiper-splot li').eq(0).addClass('current').siblings().removeClass('current');
					$('.m-swiper-splot li').eq(0).children().addClass('hd').parent().siblings().children().removeClass('hd');
				}else{
					$('.m-swiper-splot li').eq(i).addClass('current').siblings().removeClass('current');
					$('.m-swiper-splot li').eq(i).children().addClass('hd').parent().siblings().children().removeClass('hd');
				}
			}
	
		});
		
		//点击切换
		var flag = false;
		$(".m-lf-btn>span").click(function(){
			if($(".m-sld li").eq(0).css('left') == "-1000px"){
				for(var i =0;i<5;i++){
//					$(".m-sld li").eq(i).css({
//						left: "+=1000px"
//					});
					$(".m-sld li").eq(i).animate({
						left: "+=1000px"
					},"slow")
					$(".m-sd li").eq(i).animate({
						left: "+=996px"
					},"slow")
					
				}
				for(var i=5;i<10;i++){
					$(".m-sld li").eq(i).animate({
						left: "+=1000px"
					},"slow")
					$(".m-sd li").eq(i).animate({
						left: "+=996px"
					},"slow")
				}
				$(".m-rl-btn").css({
					opacity:1
				})
				$(".m-rl-btn").hover(function(){
					$(this).css({
						backgroundColor:'gray'
					})
				},function(){
					$(this).css({
						backgroundColor:'#fff'
					})	  
				})
				$(".m-lf-btn").css({
					opacity:0.4
				})
				flag = true;
			}
		})
		
		$(".m-rl-btn>span").click(function(){
			if(flag){
				for(var i =5;i<10;i++){
//					$(".m-sld li").eq(i).css({
//						left: "-=1000px"
//					});
					$(".m-sld li").eq(i).animate({
						left: "-=1000px"
					},"slow")
					$(".m-sd li").eq(i).animate({
						left: "-=996px"
					},"slow")
				}
				for(var i=0;i<5;i++){
					$(".m-sld li").eq(i).animate({
						left: "-=1000px"
					},"slow")
					$(".m-sd li").eq(i).animate({
						left: "-=996px"
					},"slow")
				}
				$(".m-lf-btn").css({
					opacity:1
				})
				$(".m-lf-btn").hover(function(){
					$(this).css({
						backgroundColor:'gray'
					})
				},function(){
					$(this).css({
						backgroundColor:'#fff'
					})	  
				})
				$(".m-rl-btn").css({
					opacity:0.4
				})
				
				flag = false;
			}
			
		})
		//		微信二维码
		$(".icon-weixin").hover(function(){
			$(".u-qr").show();
	
		},function(){
			$(".u-qr").hide();
		})