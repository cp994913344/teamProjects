!function(){var a=document,b={};b.def={un:function(a){return"undefined"==typeof a},trim:function(a){return a.replace(/^\s+|\s+$/g,"")},each:function(a,c){"function"==typeof c&&!function(){a.length>0&&!function(){for(var d=0,e=a.length;e>d;d++)!b.def.un(a[d])&&c(a[d])}()||a instanceof Object&&!function(){for(var d in a)!b.def.un(a[d])&&c(d,a[d])}()}()},assemble:function(a,c,d){return d=b.def.un(d)?"?":-1==="/&?".indexOf(d)?"?":"",a+(a.indexOf(d)>0?"&":d)+function(){var a=[];return c instanceof Object?b.def.each(c,function(b,c){/^[a-z0-9_]+$/i.test(b)&&a.push(b+"="+encodeURIComponent(c))}):a.push(c),a.join("&")}()},script:function(c,d){var e=a.createElement("script");e.type="text/javascript",e.async=b.def.un(d)===!0?!0:!!d,e.src=c,a.getElementsByTagName("head")[0].appendChild(e)},getClass:function(b){return a.getElementsByClassName?a.getElementsByClassName(b):function(){for(var c=a.getElementsByTagName("*"),d=[],e=0;e<c.length;e++)c[e].className.indexOf(b)>-1&&d.push(c[e]);return d}()}},b.show=function(a,b){var c=[],d="";return"function"==typeof b&&b(a,c),c instanceof Array&&c.length>0&&(d=c.join("")),d},b.write=function(a){return b.def.each(b.def.getClass(b.init.target),function(b){b.innerHTML=a}),!1},b.push=function(a){var d={},e="javascript:;";return b.def.each(["mid","unk","ulf","csn","csa","ult","cb","rlv","type","avatar","memberordernum","merchantlaunchordernum","merchantordernum"],function(c){var e="_"+c;b.def.un(a[e])||(d[c]=a[e])}),"string"==typeof b.callbackName?d.cb=b.callbackName:c.rlv===!0&&(d.cb="PL.ireload"),e=b.def.assemble(b.init.prevaild,d),b.def.script(e),!1},b.init={domain:"http://my.liantu.cn",local:null,ucenter:"/member",reg:"/member/reg",prevaild:"/prelogin",target:"pl-login-info"};var c={},d=window;c.MID=0,c.rlv=!1,d.PL_run=0,c.init=function(a){a&&b.def.each(a,function(a,c){"callback"===a&&"function"==typeof c?b.init.callback=c:!b.def.un(b.init[a])&&new RegExp("^[a-z0-9-/:=&.]+$","gi").exec(c)&&(b.init[a]=c)}),b.init.local&&(b.init.prevaild=b.init.local+b.init.prevaild)},c.get=function(a){var c={},d=b.init,e=a instanceof Array?a:[a];return b.def.each(e,function(a){a=b.def.trim(a),"callback"!==a&&d[a]&&(c[a]=d[a])}),c},c.logout=function(a){var c=b.init.domain+"/member/logout/i";return a&&/^[a-z_][a-z0-9_\.]*$/i.test(a)&&(c=b.def.assemble(c,{callback:a,_:(new Date).getTime()})),b.def.script(c,!1),!1},c.ireload=function(a){return a&&window.location.reload(),!1},c.preLogin=function(a){return b.callbackName=a&&/^[a-z_][a-z0-9_\.]*$/i.test(a)?a:null,b.def.script(b.def.assemble(b.init.domain+"/member/pre/login",{_:(new Date).getTime()}),!1),!1},c.run=function(){if(d.PL_run++,!b.def.un(userCookie)&&userCookie instanceof Object){var a=userCookie;if(c.MID=a._mid||0,c.rlv=a._rlv&&1===parseInt(a._rlv)?!0:!1,c.type=a._type||0,c.avatar=a.avatar||0,c.memberordernum=a.memberordernum||0,c.merchantlaunchordernum=a.merchantlaunchordernum||0,c.merchantordernum=a.merchantordernum||0,b.push(a),c.rlv===!1){var e=a._unk||"",f=b.show(e,b.init.callback||c.callback);return b.write(f||""),!0}}return!1},d.PL=c}();