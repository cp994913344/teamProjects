!function(a,b,c,d){var e=a(b);a.fn.lazyload=function(c){function f(){var b=0;h.each(function(){var c=a(this);if(!i.skip_invisible||"none"!==c.css("display"))if(a.abovethetop(this,i)||a.leftofbegin(this,i));else if(a.belowthefold(this,i)||a.rightoffold(this,i)){if(++b>i.failure_limit)return!1}else c.trigger("appear"),b=0})}var g,h=this,i={threshold:0,failure_limit:0,event:"scroll",effect:"show",container:b,data_attribute:"original",skip_invisible:!0,appear:null,load:null};return c&&(d!==c.failurelimit&&(c.failure_limit=c.failurelimit,delete c.failurelimit),d!==c.effectspeed&&(c.effect_speed=c.effectspeed,delete c.effectspeed),a.extend(i,c)),g=i.container===d||i.container===b?e:a(i.container),0===i.event.indexOf("scroll")&&g.on(i.event,function(){return f()}),this.each(function(){var b=this,c=a(b);b.loaded=!1,c.one("appear",function(){if(!this.loaded){if(i.appear){var d=h.length;i.appear.call(b,d,i)}a("<img />").on("load",function(){var d,e;c.hide().attr("src",c.data(i.data_attribute))[i.effect](i.effect_speed),b.loaded=!0,d=a.grep(h,function(a){return!a.loaded}),h=a(d),i.load&&(e=h.length,i.load.call(b,e,i))}).attr("src",c.data(i.data_attribute))}}),0!==i.event.indexOf("scroll")&&c.on(i.event,function(){b.loaded||c.trigger("appear")})}),e.on("resize",function(){f()}),/iphone|ipod|ipad.*os 5/gi.test(navigator.appVersion)&&e.on("pageshow",function(b){b=b.originalEvent||b,b.persisted&&h.each(function(){a(this).trigger("appear")})}),a(b).on("load",function(){f()}),this},a.belowthefold=function(c,f){var g;return g=f.container===d||f.container===b?e.height()+e.scrollTop():a(f.container).offset().top+a(f.container).height(),g<=a(c).offset().top-f.threshold},a.rightoffold=function(c,f){var g;return g=f.container===d||f.container===b?e.width()+e[0].scrollX:a(f.container).offset().left+a(f.container).width(),g<=a(c).offset().left-f.threshold},a.abovethetop=function(c,f){var g;return g=f.container===d||f.container===b?e.scrollTop():a(f.container).offset().top,g>=a(c).offset().top+f.threshold+a(c).height()},a.leftofbegin=function(c,f){var g;return g=f.container===d||f.container===b?e[0].scrollX:a(f.container).offset().left,g>=a(c).offset().left+f.threshold+a(c).width()},a.inviewport=function(b,c){return!(a.rightoffold(b,c)||a.leftofbegin(b,c)||a.belowthefold(b,c)||a.abovethetop(b,c))},a.extend(a.fn,{"below-the-fold":function(b){return a.belowthefold(b,{threshold:0})},"above-the-top":function(b){return!a.belowthefold(b,{threshold:0})},"right-of-screen":function(b){return a.rightoffold(b,{threshold:0})},"left-of-screen":function(b){return!a.rightoffold(b,{threshold:0})},"in-viewport":function(b){return a.inviewport(b,{threshold:0})},"above-the-fold":function(b){return!a.belowthefold(b,{threshold:0})},"right-of-fold":function(b){return a.rightoffold(b,{threshold:0})},"left-of-fold":function(b){return!a.rightoffold(b,{threshold:0})}})}($,window,document);