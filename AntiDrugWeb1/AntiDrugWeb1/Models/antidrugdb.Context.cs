﻿//------------------------------------------------------------------------------
// <auto-generated>
//    This code was generated from a template.
//
//    Manual changes to this file may cause unexpected behavior in your application.
//    Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace AntiDrugWeb1.Models
{
    using System;
    using System.Data.Entity;
    using System.Data.Entity.Infrastructure;
    
    public partial class antidrugdbEntities : DbContext
    {
        public antidrugdbEntities()
            : base("name=antidrugdbEntities")
        {
        }
    
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            throw new UnintentionalCodeFirstException();
        }
    
        public DbSet<alertmeeting> alertmeeting { get; set; }
        public DbSet<news> news { get; set; }
        public DbSet<staff> staff { get; set; }
        public DbSet<evaluate> evaluate { get; set; }
    }
}