const base = {
    get() {
        return {
            url : "http://localhost:8080/zhihuiwuliuwx/",
            name: "zhihuiwuliuwx",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhihuiwuliuwx/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧物流小程序"
        } 
    }
}
export default base
