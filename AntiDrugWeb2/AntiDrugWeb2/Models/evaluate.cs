//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace AntiDrugWeb2.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class evaluate
    {
        public int evaluateID { get; set; }
        public string patientIDCard { get; set; }
        public string patientName { get; set; }
        public string patientLastname { get; set; }
        public int patientAge { get; set; }
        public string patientAddress { get; set; }
        public int evaluatePoint { get; set; }
        public string drugType { get; set; }
        public string evaluateResult { get; set; }
        public System.DateTime evaluateDate { get; set; }
        public string evaluateByStaff { get; set; }
    }
}