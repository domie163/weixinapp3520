const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm7sval/",
            name: "ssm7sval",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7sval/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校友林微信小程序"
        } 
    }
}
export default base
