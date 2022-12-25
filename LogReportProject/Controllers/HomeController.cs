using LogReportProject.DAL;
using LogReportProject.BO;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace LogReportProject.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult GetLogReport()
        {
            LogReportRepository logReport = new LogReportRepository();

            LogJsonResponse logJsonResponse = new LogJsonResponse();

            logJsonResponse.MappedPage = logReport.ReadLog();


            return View(logJsonResponse);
        }


      
    }
}