define("public/cookie",[],function(a,b,c){c.exports={docu:window.document,set:function(a,b,c,d,e){e=e||"/";var f=new Date;return d?"hs"===d&&(f.setDate(f.getDate()+parseInt(c/24)),f.setHours(f.getHours()+c%24)):(f.setMinutes(f.getMinutes()+parseInt(c/60)),f.setSeconds(f.getSeconds()+c%60)),this.docu.cookie=a+"="+b+";expires="+f.toUTCString()+";path="+e,this},get:function(a){for(var b,c=this.docu.cookie.split("; "),d=0,e=c.length;e>d;d++)if(b=c[d].split("="),b[0]===a)return b[1];return""},remove:function(a){return this.set(a,1,-1),this}}});